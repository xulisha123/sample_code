package com.tuling.cglib.asm;

import org.objectweb.asm.ClassReader;

import java.io.IOException;

/***
 * @Author 徐庶   QQ:1092002729
 * @Slogan 致敬大师，致敬未来的你
 */
public class ClassPrinterTest {
    public static void main(String[] args) throws IOException {
        ClassReader cr = new ClassReader("com.tuling.cglib.mapper.Dao");
        ClassPrinter cp = new ClassPrinter();
        cr.accept(cp, 0);
    }
}
