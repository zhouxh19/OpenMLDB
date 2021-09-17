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
package com._4paradigm.openmldb.test_common.restful.model;

import lombok.Data;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

@Data
public class RestfulCase implements Serializable {
    private String caseId;
    private String desc;
    private String module;
    private List<String> tags;
    private int level;

    private String uri;
    private String method;
    private Map<String,String> headers;
    private Map<String,List<String>> uriParameters;
    private Map<String,List<String>> bodyParameters;
    private String body;

    private BeforeAction beforeAction;
    private AfterAction afterAction;
    private AfterAction tearDown;
    private Expect expect;
    private List<Expect> uriExpect;
    private List<Expect> bodyExpect;

}
