package com.github.joaoh4547.cachemanager.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class CacheManagerInitializer implements ServletContextListener {

    private static final Logger LOGGER = LoggerFactory.getLogger(CacheManagerInitializer.class);

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        LOGGER.info("Iniciando cache manager para o contexto {}", sce.getServletContext().getContextPath());
    }
}