package com.tuling.cglib.asm;


import jdk.internal.org.objectweb.asm.ClassVisitor;
import jdk.internal.org.objectweb.asm.MethodVisitor;

import static jdk.internal.org.objectweb.asm.Opcodes.*;
import static org.objectweb.asm.Opcodes.ACC_ABSTRACT;
import static org.objectweb.asm.Opcodes.ACC_PUBLIC;


/***
 * @Author 徐庶   QQ:1092002729
 * @Slogan 致敬大师，致敬未来的你
 */
public class ClassChangeAdapter extends ClassVisitor {

    public ClassChangeAdapter(ClassVisitor classVisitor) {
        super(ASM4, classVisitor);
    }

    @Override
    public MethodVisitor visitMethod(int access, String name, String desc, String signature, String[] exceptions) {
        // 如果当前访问到main方法就移除吊
        if(name.equals("main")) {
            return null;
        }
        MethodVisitor mv =super.visitMethod(access, name,
                desc, signature, exceptions);
        MethodChangeAdaper methodChangeAdaper = new MethodChangeAdaper(ASM4, mv, access, name, desc);
        return methodChangeAdaper;
    }

}
