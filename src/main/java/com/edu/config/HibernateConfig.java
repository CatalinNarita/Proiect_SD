package com.edu.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.naming.NamingException;
import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import java.util.Properties;

@Configuration
@EnableJpaRepositories(basePackages = "com.edu.control.dao",
        entityManagerFactoryRef = "entityManagerFactory",
        transactionManagerRef = "transactionManager")
@EnableTransactionManagement
public class HibernateConfig {

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory() throws NamingException {
        LocalContainerEntityManagerFactoryBean factoryBean = new LocalContainerEntityManagerFactoryBean();
        factoryBean.setDataSource(dataSource());
        factoryBean.setPackagesToScan(new String[]{"com.edu.entity"});
        factoryBean.setJpaVendorAdapter(jpaVendorAdapter());
        factoryBean.setJpaProperties(jpaProperties());
        return factoryBean;
    }

    @Bean
    public JpaVendorAdapter jpaVendorAdapter() {
        HibernateJpaVendorAdapter hibernateJpaVendorAdapter = new HibernateJpaVendorAdapter();
        return hibernateJpaVendorAdapter;
    }

    private Properties jpaProperties() {
        Properties properties = new Properties();
        properties.put("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
        properties.put("hibernate.hbm2ddl.auto", "create-drop");
        properties.put("hibernate.show_sql", "true");
        properties.put("spring.jpa.format-sql", "true");
        properties.put("hibernate.hbm2ddl.import_files", "initial_data.sql");

        return properties;
    }

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/ds_project?createDatabaseIfNotExist=true");
        dataSource.setUsername("root");
        dataSource.setPassword("admin");
        return dataSource;
    }

    @Bean
    @Autowired
    public PlatformTransactionManager transactionManager(EntityManagerFactory emf) {
        JpaTransactionManager txManager = new JpaTransactionManager();
        txManager.setEntityManagerFactory(emf);
        return txManager;
    }


}

