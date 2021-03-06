// This is a generated file. Not intended for manual editing.
package org.intellij.erlang.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.intellij.erlang.ErlangTypes.*;
import org.intellij.erlang.psi.*;

public class ErlangBinUnitTypeImpl extends ErlangTypeImpl implements ErlangBinUnitType {

  public ErlangBinUnitTypeImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ErlangVisitor) ((ErlangVisitor)visitor).visitBinUnitType(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<ErlangQVar> getQVarList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ErlangQVar.class);
  }

  @Override
  @NotNull
  public PsiElement getColon() {
    return findNotNullChildByType(ERL_COLON);
  }

  @Override
  @NotNull
  public PsiElement getOpArMul() {
    return findNotNullChildByType(ERL_OP_AR_MUL);
  }

  @Override
  @NotNull
  public PsiElement getInteger() {
    return findNotNullChildByType(ERL_INTEGER);
  }

}
