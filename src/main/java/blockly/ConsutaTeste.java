package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class ConsutaTeste {

public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */
// ConsutaTeste
public static Var Executar() throws Exception {
 return new Callable<Var>() {

   private Var item = Var.VAR_NULL;

   public Var call() throws Exception {
    item = cronapi.database.Operations.query(Var.valueOf("app.entity.User"),Var.valueOf("select u.email, u.id, u.login, u.name, u.picture, u.theme, u.password from User u where u.login = :login"),Var.valueOf("login",cronapi.util.Operations.getCurrentUserName()));
    System.out.println(item.getObjectAsString());
    return item;
   }
 }.call();
}

}

