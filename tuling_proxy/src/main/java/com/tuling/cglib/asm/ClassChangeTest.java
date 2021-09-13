package com.tuling.cglib.asm;

import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;

import java.io.IOException;

/***
 * @Author 徐庶   QQ:1092002729
 * @Slogan 致敬大师，致敬未来的你
 */
public class ClassChangeTest {
    public static void main(String[] args) throws IOException {
        ClassWriter cw = new ClassWriter(0);
        ClassReader cr = new ClassReader("com.tuling.TestI");
        cr.accept(cw, 0);
        byte[] b = cw.toByteArray(); //


        MyClassLoader classLoader=new MyClassLoader();
        Class loadedClass = classLoader.defineClass("com.tuling.TestI", b);
        System.out.println( loadedClass.getMethods()[0]);
    }
}
