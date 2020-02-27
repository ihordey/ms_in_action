//package java;

import com.thoughtmechanix.licenses.repository.OrganizationRedisRepositoryImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {
        OrganizationRedisRepositoryImpl.class,
        RedisConnectionTest.Configuration.class})
//@Import(OrganizationRedisRepositoryImpl.class)
public class RedisConnectionTest {
    //    @Autowired
//    private OrganizationRedisRepositoryImpl redisRepository;
    @Autowired
    private OrganizationRedisRepositoryImpl redisRepository;

    @Test
    public void checkConnectionToRedis() {
//        LettuceConnectionFactory connectionFactory = new LettuceConnectionFactory("172.30.151.144", 6379);
//        RedisTemplate<String, Object> template = new RedisTemplate<>();
//        template.setConnectionFactory(connectionFactory);
//        HashOperations<String, Object, Object> operations = template.opsForHash();
        redisRepository.findOrganization("234");
    }

    @org.springframework.context.annotation.Configuration
    static class Configuration {

        @Bean
        public RedisTemplate template() {
            JedisConnectionFactory jedisConnFactory = new JedisConnectionFactory();
            jedisConnFactory.setHostName("172.30.151.144");
            jedisConnFactory.setPort(6379);
            RedisTemplate<String, Object> template = new RedisTemplate<>();
            template.setConnectionFactory(jedisConnFactory);
            return template;
        }
    }
}
