/*
 * Copyright 2010-2019 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.fir;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/fir/resolve/testData/resolve/stdlib")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class FirResolveTestCaseWithStdlibGenerated extends AbstractFirResolveTestCaseWithStdlib {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
    }

    public void testAllFilesPresentInStdlib() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/fir/resolve/testData/resolve/stdlib"), Pattern.compile("^([^.]+)\\.kt$"), TargetBackend.ANY, true);
    }

    @TestMetadata("concurrent.kt")
    public void testConcurrent() throws Exception {
        runTest("compiler/fir/resolve/testData/resolve/stdlib/concurrent.kt");
    }

    @TestMetadata("functionX.kt")
    public void testFunctionX() throws Exception {
        runTest("compiler/fir/resolve/testData/resolve/stdlib/functionX.kt");
    }

    @TestMetadata("reflectionClass.kt")
    public void testReflectionClass() throws Exception {
        runTest("compiler/fir/resolve/testData/resolve/stdlib/reflectionClass.kt");
    }
}
