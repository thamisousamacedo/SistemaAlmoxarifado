import Model.BancoDeDados;
import Model.Item;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Item item = new Item("Impressora", 12);

        BancoDeDados b = new BancoDeDados();
        b.cadastrar(item);

        ArrayList<Item> itens = b.getItens();

        for (int i = 0; i < itens.size(); i++) {
            System.out.println("Nome do Item: "+itens.get(i).getNome());
            System.out.println("Código: "+itens.get(i).getCodigo());

        }
    }
}