package com.heitor.java.samples.s3impl;
import com.amazonaws.services.s3.model.*;
import io.micrometer.common.util.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import com.amazonaws.services.s3.AmazonS3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.sql.Date;
import java.time.Instant;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class S3Controller {

    @Value("${config.aws.s3.bucket-name}")  private String bucketName;
    private final AmazonS3 amazonS3;

    public S3Controller(AmazonS3 amazonS3) {
        this.amazonS3 = amazonS3;
    }

    @GetMapping("/object")
    private void getObjects(){
        System.out.format("Objects in S3 bucket %s:\n", bucketName);

        ListObjectsV2Result result = amazonS3.listObjectsV2(bucketName);
        List<S3ObjectSummary> objects = result.getObjectSummaries();
        for (S3ObjectSummary os : objects) {
            System.out.println("* " + os.getKey());
        }
    }

    @GetMapping("/buckets")
    private void getBuckets(){
        System.out.format("Objects in S3 bucket %s:\n", bucketName);

        List<Bucket> buckets = amazonS3.listBuckets();
        System.out.println("Your Amazon S3 buckets are:");
        for (Bucket b : buckets) {
            System.out.println("* " + b.getName());
        }
    }

    @RequestMapping(value = {"/object", "/object/{prefix}"}, method = RequestMethod.POST)
    private void createObject(@PathVariable(value = "prefix", required = false) String prefix,@RequestBody String data){
        System.out.format("Uploading to S3 bucket %s...\n", bucketName);

        String s3name = StringUtils.isEmpty(prefix)? Date.from(Instant.now()).toString() : prefix;

        System.out.format("Item name %s...\n", s3name);

        // buscar p ver se esta duplicado =)
        amazonS3.putObject(bucketName, s3name, data);

        System.out.println("Done!");
    }

    @GetMapping("/object-item/{item}")
    private void getObjectItem(@PathVariable("item") String item ) {
        System.out.format("Get S3 bucket %s retrieving item %s...\n", bucketName, item);
        S3Object object = amazonS3.getObject(new GetObjectRequest(bucketName, item));
        final InputStreamReader streamReader = new InputStreamReader(object.getObjectContent(), StandardCharsets.UTF_8);
        final BufferedReader reader = new BufferedReader(streamReader);
        System.out.println(reader.lines().collect(Collectors.toSet()));
    }
}
