package com.marklogic.scxml;

import com.marklogic.test.jdom.Fragment;

public class Instance extends Fragment {

    public Instance(Fragment other) {
        super(other);
    }

    public void assertState(String state) {
        assertElementValue("/mlsc:instance/mlsc:state", state);
    }

    public void assertDatamodelElementExists(String dataId, String xpath) {
        String path = format("/mlsc:instance/sc:datamodel/sc:data[@id = '%s']/%s", dataId, xpath);
        assertElementExists(path);
    }
}