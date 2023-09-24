package escola;

public class Escola {
	public static void main(String[] args) {
		aluno felipe = new aluno();
		felipe.setNome("Felipe Junior ");
		felipe.setIdade(12);
		
		System.out.println(" O aluno " + felipe.getNome() + " tem " + felipe.getIdade());
	}

}
