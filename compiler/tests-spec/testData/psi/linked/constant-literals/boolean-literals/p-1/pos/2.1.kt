/*
 KOTLIN PSI SPEC TEST (POSITIVE)

 SECTIONS: constant-literals, boolean-literals
 PARAGRAPH: 1
 SENTENCE: [2] These are strong keywords which cannot be used as identifiers unless escaped.
 NUMBER: 1
 DESCRIPTION: The use of Boolean literals as the identifier (with backtick) in the class.
 NOTE: this test data is generated by FeatureInteractionTestDataGenerator. DO NOT MODIFY CODE MANUALLY!
 */

class `true` {}

internal class A: `false` {}

interface `true` {}

interface A: @`false` B {}

interface A: B, C, `true` {}