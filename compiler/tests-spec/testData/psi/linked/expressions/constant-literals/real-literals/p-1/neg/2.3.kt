/*
 * KOTLIN PSI SPEC TEST (NEGATIVE)
 *
 * SPEC VERSION: 0.1-100
 * PLACE: expressions, constant-literals, real-literals -> paragraph 1 -> sentence 2
 * NUMBER: 3
 * DESCRIPTION: Not allowed real literals with a whole-number part as a hexadecimal number and a fraction part as a binary number (or vice versa).
 */

val value = 0b110000.0XAAAA
val value = 0B1100.0xFA
val value = 0b0110011100110001.0X0

val value = 0x100.0b110011100110001
val value = 0x100.0b0
val value = 0X0.0B1100111
val value = 0x00.0b0
val value = 0x00.0B110001
val value = 0x001.0b010100110001
val value = 0xFA.0b110001
val value = 0XAAAA.0B11

val value = 0b011001110011000101100111001100010110011100110001011001110011000101100111001100010110011100110001011001110011000101100111001100010110011100110001011001110011000101100111001100010110011100110001.0x0123456789ABCDEF0123456789ABCDEF0123456789ABCDEF0123456789ABCDEF0123456789ABCDEF0123456789ABCDEF0123456789ABCDEF0123456789ABCDEF0123456789ABCDEF0123456789ABCDEF0123456789ABCDEF
val value = 0X0123456789ABCDEF0123456789ABCDEF0123456789ABCDEF0123456789ABCDEF0123456789ABCDEF0123456789ABCDEF0123456789ABCDEF0123456789ABCDEF0123456789ABCDEF0123456789ABCDEF0123456789ABCDEF0123456789ABCDEF.0b100111000110011100011001110001100111000110011100011001110001100111000110011100011001110001100111000110011100011001110001100111000110011100011001110001100111000110011100011001
val value = 0B1100111000110011100011001110001100111000110011100011001110001100111000110011100011001110001100111000110011100011001110001100111000110011100011001110001100111000110011100011001.0B1100111000110011100011001110001100111000110011100011001110001100111000110011100011001110001100111000110011100011001110001100111000110011100011001110001100111000110011100011001110001100111000110
val value = 0xABCDEF0123456789ABCDEF0123456789ABCDEF0123456789ABCDEF0123456789ABCDEF0123456789ABCDEF0123456789ABCDEF0123456789ABCDEF0123456789ABCDEF0123456789ABCDEF0123456789ABCDEF0123456789ABCDEF0123456789AB.0b11000101100111001100010110011100110001011001110011000101100111001100010110011100110001011001110011000101100111001100010110011100110001011001110011000101100111001100010110011100110001011001110011
