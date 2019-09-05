/*
 * Copyright 2010-2019 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.android.synthetic.test;

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
@RunWith(JUnit3RunnerWithInners.class)
public class AndroidBoxTestGenerated extends AbstractAndroidBoxTest {
    @TestMetadata("plugins/android-extensions/android-extensions-compiler/testData/codegen/android")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Android extends AbstractAndroidBoxTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doCompileAgainstAndroidSdkTest, TargetBackend.ANY, testDataFilePath);
        }

        public void testAllFilesPresentInAndroid() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("plugins/android-extensions/android-extensions-compiler/testData/codegen/android"), Pattern.compile("^([^\\.]+)$"), TargetBackend.ANY, false);
        }

        @TestMetadata("androidEntity")
        public void testAndroidEntity() throws Exception {
            runTest("plugins/android-extensions/android-extensions-compiler/testData/codegen/android/androidEntity/");
        }

        @TestMetadata("androidEntityInnerClass")
        public void testAndroidEntityInnerClass() throws Exception {
            runTest("plugins/android-extensions/android-extensions-compiler/testData/codegen/android/androidEntityInnerClass/");
        }

        @TestMetadata("fqNameInAttr")
        public void testFqNameInAttr() throws Exception {
            runTest("plugins/android-extensions/android-extensions-compiler/testData/codegen/android/fqNameInAttr/");
        }

        @TestMetadata("fqNameInTag")
        public void testFqNameInTag() throws Exception {
            runTest("plugins/android-extensions/android-extensions-compiler/testData/codegen/android/fqNameInTag/");
        }

        @TestMetadata("fragment")
        public void testFragment() throws Exception {
            runTest("plugins/android-extensions/android-extensions-compiler/testData/codegen/android/fragment/");
        }

        @TestMetadata("fragmentNoGetView")
        public void testFragmentNoGetView() throws Exception {
            runTest("plugins/android-extensions/android-extensions-compiler/testData/codegen/android/fragmentNoGetView/");
        }

        @TestMetadata("manyWidgets")
        public void testManyWidgets() throws Exception {
            runTest("plugins/android-extensions/android-extensions-compiler/testData/codegen/android/manyWidgets/");
        }

        @TestMetadata("multiFile")
        public void testMultiFile() throws Exception {
            runTest("plugins/android-extensions/android-extensions-compiler/testData/codegen/android/multiFile/");
        }

        @TestMetadata("singleFile")
        public void testSingleFile() throws Exception {
            runTest("plugins/android-extensions/android-extensions-compiler/testData/codegen/android/singleFile/");
        }

        @TestMetadata("view")
        public void testView() throws Exception {
            runTest("plugins/android-extensions/android-extensions-compiler/testData/codegen/android/view/");
        }
    }

    @TestMetadata("plugins/android-extensions/android-extensions-compiler/testData/codegen/android")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Invoke extends AbstractAndroidBoxTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doFakeInvocationTest, TargetBackend.ANY, testDataFilePath);
        }

        public void testAllFilesPresentInInvoke() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("plugins/android-extensions/android-extensions-compiler/testData/codegen/android"), Pattern.compile("^([^\\.]+)$"), TargetBackend.ANY, false);
        }

        @TestMetadata("androidEntity")
        public void testAndroidEntity() throws Exception {
            runTest("plugins/android-extensions/android-extensions-compiler/testData/codegen/android/androidEntity/");
        }

        @TestMetadata("androidEntityInnerClass")
        public void testAndroidEntityInnerClass() throws Exception {
            runTest("plugins/android-extensions/android-extensions-compiler/testData/codegen/android/androidEntityInnerClass/");
        }

        @TestMetadata("fqNameInAttr")
        public void testFqNameInAttr() throws Exception {
            runTest("plugins/android-extensions/android-extensions-compiler/testData/codegen/android/fqNameInAttr/");
        }

        @TestMetadata("fqNameInTag")
        public void testFqNameInTag() throws Exception {
            runTest("plugins/android-extensions/android-extensions-compiler/testData/codegen/android/fqNameInTag/");
        }

        @TestMetadata("fragment")
        public void testFragment() throws Exception {
            runTest("plugins/android-extensions/android-extensions-compiler/testData/codegen/android/fragment/");
        }

        @TestMetadata("fragmentNoGetView")
        public void testFragmentNoGetView() throws Exception {
            runTest("plugins/android-extensions/android-extensions-compiler/testData/codegen/android/fragmentNoGetView/");
        }

        @TestMetadata("manyWidgets")
        public void testManyWidgets() throws Exception {
            runTest("plugins/android-extensions/android-extensions-compiler/testData/codegen/android/manyWidgets/");
        }

        @TestMetadata("multiFile")
        public void testMultiFile() throws Exception {
            runTest("plugins/android-extensions/android-extensions-compiler/testData/codegen/android/multiFile/");
        }

        @TestMetadata("singleFile")
        public void testSingleFile() throws Exception {
            runTest("plugins/android-extensions/android-extensions-compiler/testData/codegen/android/singleFile/");
        }

        @TestMetadata("view")
        public void testView() throws Exception {
            runTest("plugins/android-extensions/android-extensions-compiler/testData/codegen/android/view/");
        }
    }
}
