public class ForArrays {
    public static void main(String[] args) {
        //O indice em Arrays iniciar em zero (0)
        String alunos [] = {"ALISSON", "MARIA","JONAS", "MARCOS"};
        for (int x = 0; x < alunos.length; x++){// x menor que tamaho alunos
            System.out.println("O aluno no indice x=" + x + " e " + alunos[x]);//imprimir pelo Indice do Array alunos
        }
    }
    
}
