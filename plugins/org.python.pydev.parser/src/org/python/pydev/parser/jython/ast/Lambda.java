// Autogenerated AST node
package org.python.pydev.parser.jython.ast;

import org.python.pydev.parser.jython.SimpleNode;
import java.util.Arrays;

public final class Lambda extends exprType {
    public argumentsType args;
    public exprType body;

    public Lambda(argumentsType args, exprType body) {
        this.args = args;
        this.body = body;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((args == null) ? 0 : args.hashCode());
        result = prime * result + ((body == null) ? 0 : body.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        Lambda other = (Lambda) obj;
        if (args == null) { if (other.args != null) return false;}
        else if (!args.equals(other.args)) return false;
        if (body == null) { if (other.body != null) return false;}
        else if (!body.equals(other.body)) return false;
        return true;
    }
    @Override
    public Lambda createCopy() {
        return createCopy(true);
    }
    @Override
    public Lambda createCopy(boolean copyComments) {
        Lambda temp = new Lambda(args!=null?(argumentsType)args.createCopy(copyComments):null,
        body!=null?(exprType)body.createCopy(copyComments):null);
        temp.beginLine = this.beginLine;
        temp.beginColumn = this.beginColumn;
        if(this.specialsBefore != null && copyComments){
            for(Object o:this.specialsBefore){
                if(o instanceof commentType){
                    commentType commentType = (commentType) o;
                    temp.getSpecialsBefore().add(commentType.createCopy(copyComments));
                }
            }
        }
        if(this.specialsAfter != null && copyComments){
            for(Object o:this.specialsAfter){
                if(o instanceof commentType){
                    commentType commentType = (commentType) o;
                    temp.getSpecialsAfter().add(commentType.createCopy(copyComments));
                }
            }
        }
        return temp;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("Lambda[");
        sb.append("args=");
        sb.append(dumpThis(this.args));
        sb.append(", ");
        sb.append("body=");
        sb.append(dumpThis(this.body));
        sb.append("]");
        return sb.toString();
    }

    @Override
    public Object accept(VisitorIF visitor) throws Exception {
        return visitor.visitLambda(this);
    }

    @Override
    public void traverse(VisitorIF visitor) throws Exception {
        if (args != null) {
            args.accept(visitor);
        }
        if (body != null) {
            body.accept(visitor);
        }
    }

}
