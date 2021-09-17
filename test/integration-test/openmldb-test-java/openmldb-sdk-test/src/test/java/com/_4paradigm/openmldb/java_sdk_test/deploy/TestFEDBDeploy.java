/*
 * Copyright 2021 4Paradigm
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com._4paradigm.openmldb.java_sdk_test.deploy;

import com._4paradigm.openmldb.java_sdk_test.common.FedbGlobalVar;
import com._4paradigm.openmldb.test_common.util.FEDBDeploy;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;

public class TestFEDBDeploy{
    @Test
    public void pythonDeploy(@Optional("qa") String env, @Optional("main") String version, @Optional("")String fedbPath){
        FedbGlobalVar.env = env;
        if(env.equalsIgnoreCase("cluster")){
            FEDBDeploy fedbDeploy = new FEDBDeploy(version);
            fedbDeploy.setFedbPath(fedbPath);
            fedbDeploy.setCluster(true);
            FedbGlobalVar.mainInfo = fedbDeploy.deployFEDB(2, 3);
        }else if(env.equalsIgnoreCase("standalone")){
            FEDBDeploy fedbDeploy = new FEDBDeploy(version);
            fedbDeploy.setFedbPath(fedbPath);
            fedbDeploy.setCluster(false);
            FedbGlobalVar.mainInfo = fedbDeploy.deployFEDB(2, 3);
        }
    }
}
