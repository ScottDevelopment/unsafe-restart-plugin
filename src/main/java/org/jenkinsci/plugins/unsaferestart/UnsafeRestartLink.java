package org.jenkinsci.plugins.unsaferestart;

import hudson.Extension;
import hudson.model.ManagementLink;

@Extension
public class UnsafeRestartLink extends ManagementLink {

    @Override
    public boolean getRequiresConfirmation() {
        return true;
    }

    public String getDisplayName() {
        return Messages.DisplayName();
    }

    @Override
    public String getDescription() {
        return Messages.Description();
    }

    @Override
    public String getIconFileName() {
        return "system-log-out.png";
    }

    @Override
    public String getUrlName() {
        return "restart";
    }
}
