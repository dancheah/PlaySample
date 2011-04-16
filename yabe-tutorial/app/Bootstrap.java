/**
 * Created by IntelliJ IDEA.
 * User: dc
 * Date: 4/15/11
 * Time: 3:20 PM
 * To change this template use File | Settings | File Templates.
 */
import play.jobs.*;
import play.test.*;

import models.*;

@OnApplicationStart
public class Bootstrap extends Job {

    public void doJob() {
        // Check if the database is empty
        if(User.count() == 0) {
            Fixtures.loadModels("initial-data.yml");
        }
    }
}
