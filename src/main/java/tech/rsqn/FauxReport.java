package tech.rsqn;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.Mojo;

@Mojo(name = "fauxreport")
public class FauxReport extends AbstractMojo {

    public void execute() throws MojoExecutionException {
        getLog().info("Hello, world.");
    }
}