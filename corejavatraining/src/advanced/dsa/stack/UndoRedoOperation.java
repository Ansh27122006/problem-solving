package advanced.dsa.stack;

import java.util.Stack;

public class UndoRedoOperation {
    static String UR(String s, int ctz, int cty){
        String[] arr = s.split(" ");
       Stack<String> undo = new Stack<>();
        Stack<String> redo = new Stack<>();

        for(String e: arr){
            undo.push(e);
        }

        for(int i=0;i<ctz && !undo.isEmpty();i++){
            redo.push(undo.pop());
        }

        for(int i=0;i<cty && !redo.isEmpty();i++){
            undo.push(redo.pop());
        }

        StringBuilder str = new StringBuilder();
        for(String e:undo){
            str.append(e);
            str.append(" ");
        }
        return str.toString();
    }
    public static void main(String[] args) {
        String s="HEllo everyone! This is a sample testcase 123";
        System.out.println(UR(s,10,5));
    }
}
