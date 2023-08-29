package com.custom_info_checks;

import org.springframework.boot.actuate.info.Info;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.beans.factory.annotation.Autowired;

//  Custom info Contributor | Step:3

@Component
public class Custom_Info_Contributor implements InfoContributor {

	  //  http://localhost:8585/users_credentials/actuator/info

	  @Autowired
	  private Environment environment;

	  @Override
	  public void contribute(Info.Builder builder) {
	    builder.withDetail("port", environment.getProperty("local.server.port"));
	    builder.withDetail("profiles", environment.getDefaultProfiles());
	    builder.withDetail("customInfo", "This is a custom info message.");
            builder.withDetail("author", "Sankha Subhra Mondal");
	  }

}
