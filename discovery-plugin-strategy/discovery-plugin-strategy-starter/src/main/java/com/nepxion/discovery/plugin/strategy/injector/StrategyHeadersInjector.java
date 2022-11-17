package com.nepxion.discovery.plugin.strategy.injector;

/**
 * <p>Title: Nepxion Discovery</p>
 * <p>Description: Nepxion Discovery</p>
 * <p>Copyright: Copyright (c) 2017-2050</p>
 * <p>Company: Nepxion</p>
 * @author Haojun Ren
 * @version 1.0
 */

import java.util.List;

import com.nepxion.discovery.common.entity.HeadersInjectorEntity;

public interface StrategyHeadersInjector {
    List<HeadersInjectorEntity> getHeadersInjectorEntityList();
}