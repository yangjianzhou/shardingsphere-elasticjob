package com.iwill.elasticJob.listener;

import org.apache.shardingsphere.elasticjob.infra.listener.ElasticJobListener;
import org.apache.shardingsphere.elasticjob.infra.listener.ShardingContexts;
import org.springframework.stereotype.Component;

@Component
public class TestListener implements ElasticJobListener {

    @Override
    public void beforeJobExecuted(ShardingContexts shardingContexts) {
        System.out.printf("beforeJobExecuted {}" ,shardingContexts);
    }

    @Override
    public void afterJobExecuted(ShardingContexts shardingContexts) {
        System.out.printf("afterJobExecuted {}" ,shardingContexts);
    }

    @Override
    public String getType() {
        return "simpleJobListener";
    }
}
