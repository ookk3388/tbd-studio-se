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
package org.talend.hadoop.distribution.mapr213.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.talend.hadoop.distribution.EHadoopVersion;
import org.talend.hadoop.distribution.component.HBaseComponent;
import org.talend.hadoop.distribution.component.HCatalogComponent;
import org.talend.hadoop.distribution.component.HDFSComponent;
import org.talend.hadoop.distribution.component.HadoopComponent;
import org.talend.hadoop.distribution.component.HiveComponent;
import org.talend.hadoop.distribution.component.ImpalaComponent;
import org.talend.hadoop.distribution.component.MRComponent;
import org.talend.hadoop.distribution.component.PigComponent;
import org.talend.hadoop.distribution.component.SparkBatchComponent;
import org.talend.hadoop.distribution.component.SparkStreamingComponent;
import org.talend.hadoop.distribution.component.SqoopComponent;
import org.talend.hadoop.distribution.mapr213.MapR213Distribution;
import org.talend.hadoop.distribution.test.AbstractDistributionTest;

/**
 * Test class for the {@link MapR213Distribution} distribution.
 *
 */
public class MapR213DistributionTest extends AbstractDistributionTest {

    public MapR213DistributionTest() {
        super(new MapR213Distribution());
    }

    private final static String EMPTY = ""; //$NON-NLS-1$

    @Test
    public void testMapR213Distribution() throws Exception {
        HadoopComponent distribution = new MapR213Distribution();
        assertNotNull(distribution.getDistributionName());
        assertNotNull(distribution.getVersionName(null));
        assertFalse(distribution.doSupportS3());
        assertEquals(MapR213Distribution.DISTRIBUTION_NAME, distribution.getDistribution());
        assertEquals(MapR213Distribution.VERSION, distribution.getVersion());
        assertEquals(EHadoopVersion.HADOOP_1, distribution.getHadoopVersion());
        assertFalse(distribution.doSupportKerberos());
        assertFalse(distribution.doSupportUseDatanodeHostname());
        assertTrue(distribution.doSupportGroup());
        assertTrue(distribution.doSupportOldImportMode());
        assertFalse(((HDFSComponent) distribution).doSupportSequenceFileShortType());
        assertFalse(((MRComponent) distribution).isExecutedThroughWebHCat());
        assertFalse(((MRComponent) distribution).doSupportCrossPlatformSubmission());
        assertFalse(((MRComponent) distribution).doSupportImpersonation());
        assertEquals(EMPTY, ((MRComponent) distribution).getYarnApplicationClasspath());
        assertFalse(((HBaseComponent) distribution).doSupportNewHBaseAPI());
        assertFalse(((SqoopComponent) distribution).doJavaAPISupportStorePasswordInFile());
        assertFalse(((SqoopComponent) distribution).doJavaAPISqoopImportSupportDeleteTargetDir());
        assertFalse(((SqoopComponent) distribution).doJavaAPISqoopImportAllTablesSupportExcludeTable());
        assertFalse(((PigComponent) distribution).doSupportHCatalog());
        assertFalse(((PigComponent) distribution).pigVersionPriorTo_0_12());
        assertTrue(((PigComponent) distribution).doSupportHBase());
        assertFalse(((PigComponent) distribution).doSupportTezForPig());
        assertTrue(((HiveComponent) distribution).doSupportEmbeddedMode());
        assertTrue(((HiveComponent) distribution).doSupportStandaloneMode());
        assertTrue(((HiveComponent) distribution).doSupportHive1());
        assertTrue(((HiveComponent) distribution).doSupportHive2());
        assertFalse(((HiveComponent) distribution).doSupportTezForHive());
        assertTrue(((HiveComponent) distribution).doSupportHBaseForHive());
        assertFalse(((HiveComponent) distribution).doSupportSSL());
        assertTrue(((HiveComponent) distribution).doSupportORCFormat());
        assertTrue(((HiveComponent) distribution).doSupportAvroFormat());
        assertTrue(((HiveComponent) distribution).doSupportParquetFormat());
        assertFalse(((HiveComponent) distribution).doSupportStoreAsParquet());
        assertFalse(((HiveComponent) distribution).doSupportClouderaNavigator());
        assertFalse(distribution instanceof SparkBatchComponent);
        assertFalse(distribution instanceof SparkStreamingComponent);
        assertFalse(distribution instanceof HCatalogComponent);
        assertFalse(distribution instanceof ImpalaComponent);
        
        assertTrue(distribution.doSupportCreateServiceConnection());
        assertTrue((distribution.getNecessaryServiceName() == null ? 0 : distribution.getNecessaryServiceName().size()) == 0);
    }

}
