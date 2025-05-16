package Model;

import java.io.*;
import java.util.ArrayList;

public class BancoDeDados {
    private ArrayList<String> linhas;
    private ArrayList<Item> itens;


    public BancoDeDados() {
        linhas = new ArrayList<>();
        ler();
        itens = new ArrayList<>();
        transformarLinhasEmObjetos(linhas);
    }

    public void cadastrar(Item item) {
        String linha = "";
        try {
            OutputStream os = new FileOutputStream("produtos.txt", true);
            OutputStreamWriter osw = new OutputStreamWriter(os);
            BufferedWriter br = new BufferedWriter(osw);

            linha = item.getNome()+ ","+item.getCodigo();
            br.write(linha);
            br.newLine();

            br.close();
            osw.close();
            os.close();
            System.out.println(linha+" foi cadastrada com sucesso!");
            System.out.println("O arquivo de cadastro foi fechado!");
            atualizar();
        }catch(Exception e){
            System.out.println("Não foi possível escrever a informação no arquivo de texto!");
            System.out.println(e);
        }
    }

    public void ler() {
        String linha = "";
        try {
            InputStream is = new FileInputStream("produtos.txt");
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);

            linha = br.readLine();

            while (linha !=null) {
                System.out.println(linha);
                linhas.add(linha);
                linha = br.readLine();
            }

            br.close();
            isr.close();
            is.close();
            System.out.println("O arquivo de texto foi lido com sucesso!");
        } catch(Exception e) {
            System.out.println("Não foi possível ler os arquivos de texto!");
            System.out.println(e);
        }

        }

    public void transformarLinhasEmObjetos(ArrayList<String> linhas) {
        String[] aux = new String[2];
        Item item;

        for (int i = 0; i < linhas.size(); i++) {
            aux = linhas.get(i).split(",");
            item = new Item(aux[0], Integer.parseInt(aux[1]));
            itens.add(item);
        }

        System.out.println("Os dados dos itens foram atualizados com as novas informações cadastradas");
        }

        public ArrayList<Item> getItens() {
            return itens;
        }

        public void atualizar() {
            ler();
            transformarLinhasEmObjetos(linhas);

            System.out.println("Os dados dos itens foram atualizados com as novas informações cadastradas");
        }


    }

