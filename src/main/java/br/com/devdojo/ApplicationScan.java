package br.com.devdojo;

import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackageClasses = {}, basePackages = { "br.com.devdojo.controller", "br.com.devdojo.endpoint" })
public class ApplicationScan {

}
