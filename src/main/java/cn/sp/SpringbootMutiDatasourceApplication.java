package cn.sp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@MapperScan("cn.sp.dao")
@SpringBootApplication
public class SpringbootMutiDatasourceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMutiDatasourceApplication.class, args);
	}
}
