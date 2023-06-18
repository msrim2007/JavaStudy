import java.util.List;

import com.CommonCodeManager;
import com.CommonCodeModel;
import com.UserModel;
import com.admin.AdminController;
import com.user.UserController;

public class App {
    public static void main(String[] args) throws Exception {
        UserController userController = new UserController(CommonCodeManager.getInstance());
        AdminController adminController = new AdminController(CommonCodeManager.getInstance());

        List<UserModel> userList = userController.selectUserLevelList();
        List<CommonCodeModel> adminList = adminController.selectAdminLevelList();

        System.out.println(userList.toString());
        System.out.println(adminList.toString());
    }
}