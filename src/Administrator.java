import java.util.ArrayList;
import java.util.List;

/**
 * Created by juan on 6/18/15.
 */
public class Administrator {
    private List<String> permissions = new ArrayList<String>();
    private List<String> roles = new ArrayList<String>();

    public List<String> getPermissions() {
        return permissions;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    public void setPermissions(List<String> permissions) {
        this.permissions = permissions;
    }
}
