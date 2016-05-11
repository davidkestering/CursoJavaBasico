package com.davidkestering.cursojava.aula36;

/**
 * Created by seduc on 11/05/2016.
 */
public class TesteContato {
    public static void main(String[] args) {
        Contato contato = new Contato();
        Endereco endereco = new Endereco();
        Telefone telefone = new Telefone();
        Telefone telefone2 = new Telefone();

        contato.setNome("David");
        //contato.setEndereco("Belem");
        endereco.setRua("Rua Nova");
        endereco.setNumero("10");
        endereco.setCidade("Belém");
        endereco.setEstado("Pará");
        endereco.setCep("66623-700");
        contato.setEndereco(endereco);
        //contato.setTelefone("98042-9676");

        telefone.setTipo("Celular");
        telefone.setDdd("91");
        telefone.setNumero("98042-9676");
        //contato.setTelefone(telefone);

        telefone2.setTipo("Mara");
        telefone2.setDdd("91");
        telefone2.setNumero("98087-3246");

        Telefone[] telefones = new Telefone[2];
        telefones[0] = telefone;
        telefones[1] = telefone2;
        contato.setTelefones(telefones);

        System.out.println(contato.getNome());
        if(contato != null && contato.getEndereco() != null)
            System.out.println(contato.getEndereco().getCidade());
        //if(contato != null && contato.getTelefone() != null)
          //  System.out.println(contato.getTelefone().getNumero());
        if(contato != null && contato.getTelefones() != null){
            for(Telefone t: contato.getTelefones()){
                System.out.println(t.getDdd()+" "+t.getNumero());
            }
        }
    }
}
