package com.study.batch.batch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

/**
 * <pre>
 *
 *
 * Description : com.study.batch.batch
 * </pre>
 *
 * @author
 * @since 2024. 7. 18.
 */

// 이름 대문자로 변환
public class PersonItemProcessor  implements ItemProcessor<Person, Person> {

    private static final Logger log = LoggerFactory.getLogger(PersonItemProcessor.class);
    @Override
    public Person process(Person person) {

        final String firstName = person.firstName().toUpperCase();
        final String lastName = person.lastName().toUpperCase();

        final Person transformedPerson = new Person(firstName, lastName);

        log.info("Converting (" + person + ") into (" + transformedPerson + ")");
        return transformedPerson;
    }
}
