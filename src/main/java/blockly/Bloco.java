package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Bloco {

public static final int TIMEOUT = 300;

/**
 *
 * @param id_user
 * @param nome
 * @return Var
 */
// Bloco
public static Var Executar(Var id_user, Var nome) throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    cronapi.database.Operations.execute(Var.valueOf("app.entity.User"), Var.valueOf("update User set name = :name where id = :id"),Var.valueOf("name",nome),Var.valueOf("id",id_user));
    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.refreshDatasource"), Var.valueOf("User"), Var.valueOf("false"));
    return Var.VAR_NULL;
   }
 }.call();
}

}

