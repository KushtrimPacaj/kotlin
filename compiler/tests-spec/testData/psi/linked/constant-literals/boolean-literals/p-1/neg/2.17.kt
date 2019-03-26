/*
 * KOTLIN PSI SPEC TEST (NEGATIVE)
 *
 * SPEC VERSION: 0.1-draft
 * PLACES: constant-literals, boolean-literals -> paragraph 1 -> sentence 2
 * NUMBER: 17
 * DESCRIPTION: The use of Boolean literals as the identifier (without backtick) in the object.
 * NOTE: this test data is generated by FeatureInteractionTestDataGenerator. DO NOT MODIFY CODE MANUALLY!
 */

object A : true {}

object B : A<B<false, true>, false> {}

object true constructor() {}

object false : true<false> {}
