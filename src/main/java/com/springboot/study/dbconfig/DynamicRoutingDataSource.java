package com.springboot.study.dbconfig;

import lombok.extern.slf4j.Slf4j;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * 动态数据源路由配置
 *
 * @Author wp
 * @date 2018/11/12 10:12
 */
@Slf4j
public class DynamicRoutingDataSource extends AbstractRoutingDataSource {

    @Override
    protected Object determineCurrentLookupKey() {
        String dataSourceName = DynamicDataSourceContextHolder.getDataSourceRouterKey();
        log.info("当前数据源是：{}", dataSourceName);
        return DynamicDataSourceContextHolder.getDataSourceRouterKey();
    }
}
