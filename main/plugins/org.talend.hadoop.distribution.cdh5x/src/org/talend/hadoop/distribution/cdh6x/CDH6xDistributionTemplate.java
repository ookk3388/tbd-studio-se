// ============================================================================
//
// Copyright (C) 2006-2018 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.hadoop.distribution.cdh6x;

import org.talend.hadoop.distribution.component.HBaseComponent;
import org.talend.hadoop.distribution.component.HCatalogComponent;
import org.talend.hadoop.distribution.component.HDFSComponent;
import org.talend.hadoop.distribution.component.HiveComponent;
import org.talend.hadoop.distribution.component.ImpalaComponent;
import org.talend.hadoop.distribution.component.MRComponent;
import org.talend.hadoop.distribution.component.PigComponent;
import org.talend.hadoop.distribution.component.SqoopComponent;
import org.talend.hadoop.distribution.dynamic.adapter.DynamicPluginAdapter;
import org.talend.hadoop.distribution.dynamic.template.cdh.AbstractDynamicCDHDistributionTemplate;


/**
 * DOC cmeng  class global comment. Detailled comment
 */
@SuppressWarnings("nls")
public class CDH6xDistributionTemplate extends AbstractDynamicCDHDistributionTemplate implements HDFSComponent, HBaseComponent,
HCatalogComponent, PigComponent, MRComponent, HiveComponent, ImpalaComponent, SqoopComponent, ICDH6xDistributionTemplate {

    public final static String TEMPLATE_ID = "CDH6xDistributionTemplate";

    public CDH6xDistributionTemplate(DynamicPluginAdapter pluginAdapter) throws Exception {
        super(pluginAdapter);
    }

    @Override
    public String getTemplateId() {
        return TEMPLATE_ID;
    }

	@Override
	public boolean doJavaAPISupportStorePasswordInFile() {
		return true;
	}

	@Override
	public boolean doJavaAPISqoopImportSupportDeleteTargetDir() {
		return true;
	}

	@Override
	public boolean doJavaAPISqoopImportAllTablesSupportExcludeTable() {
		return true;
	}

	@Override
	public boolean doSupportHive1() {
		return false;
	}

	@Override
	public boolean doSupportHive2() {
		return true;
	}

	@Override
	public boolean doSupportTezForHive() {
		return false;
	}

	@Override
	public boolean doSupportHBaseForHive() {
		return false;
	}

	@Override
	public boolean doSupportSSL() {
		return true;
	}

	@Override
	public boolean doSupportORCFormat() {
		return true;
	}

	@Override
	public boolean doSupportAvroFormat() {
		return true;
	}

	@Override
	public boolean doSupportParquetFormat() {
		return true;
	}

	@Override
	public boolean doSupportStoreAsParquet() {
		return true;
	}

	@Override
	public boolean doSupportCrossPlatformSubmission() {
		return true;
	}

	@Override
	public boolean doSupportImpersonation() {
		return true;
	}

	@Override
	public boolean doSupportHCatalog() {
		return true;
	}

	@Override
	public boolean doSupportHBase() {
		return true;
	}

	@Override
	public boolean pigVersionPriorTo_0_12() {
		return false;
	}

	@Override
	public boolean doSupportNewHBaseAPI() {
		return true;
	}

	@Override
	public boolean doSupportSequenceFileShortType() {
		return true;
	}

    @Override
    public boolean doSupportHBase2x() {
        return true;
    }
}
