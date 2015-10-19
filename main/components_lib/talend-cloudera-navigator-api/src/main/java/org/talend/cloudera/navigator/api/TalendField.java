package org.talend.cloudera.navigator.api;

import com.cloudera.nav.sdk.model.SourceType;
import com.cloudera.nav.sdk.model.annotations.MClass;
import com.cloudera.nav.sdk.model.entities.DatasetField;

@MClass(model = "talend_field")
public class TalendField extends DatasetField {

    public TalendField() {
        super();
        setSourceType(SourceType.PLUGIN);
        setNamespace("Talend");
    }

    public TalendField(String name, String type) {
        this();
        setName(name);
        setDataType(type);
    }
}