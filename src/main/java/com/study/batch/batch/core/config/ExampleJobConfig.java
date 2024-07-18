package com.study.batch.batch.core.config;

import lombok.RequiredArgsConstructor;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * <pre>
 *
 *
 * Description : com.study.batch.batch.core.config
 * </pre>
 *
 * @author
 * @since 2024. 7. 18.
 */

@Configuration
@EnableBatchProcessing
@RequiredArgsConstructor
public class ExampleJobConfig {

    private final JobRepository jobRepository;
    @Bean
    public Job ExampleJob() {
        return null;
//        return new JobBuilder("myJob")
//                .repository()
    }
}
