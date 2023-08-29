package com.heitor.java.samples.hazelcast;

import com.hazelcast.client.HazelcastClient;
import com.hazelcast.client.config.ClientConfig;
import com.hazelcast.config.ManagementCenterConfig;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.flakeidgen.FlakeIdGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class HazelcastConfig {

    private HazelcastInstance hzInstance;
    @Bean
    public void initHazelcastNode(){
        System.out.println(" Starting hazelcast node");
        hzInstance = Hazelcast.newHazelcastInstance();
        Map<Long, String> map = hzInstance.getMap("data");
        FlakeIdGenerator idGenerator = hzInstance.getFlakeIdGenerator("newid");
        for (int i = 0; i < 10; i++) {
            map.put(idGenerator.newId(), "message" + i);
        }
    }

    @Bean
     public void initHazelcastClient(){
        System.out.println(" Starting hazelcast client");
        ClientConfig config = new ClientConfig();
        config.setClusterName("dev");
        HazelcastInstance hazelcastInstanceClient = HazelcastClient.newHazelcastClient(config);
        Map<Long, String> map = hazelcastInstanceClient.getMap("data");
        for (Map.Entry<Long, String> entry : map.entrySet()) {
            System.out.println(entry);
        }
    }
}
