package academy.devdojo.maratona_java.javacore.Yio.Test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*
* encapsula a writer, fazendo que tenha umamelhor performance no programa poruqe utiliza dados e memorias,
* precisa fechar recurso para o sistema operacional, entao deve criar um try/catch
* */

public class BufferedWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try(FileWriter fw = new FileWriter(file,true);
            BufferedWriter br = new BufferedWriter(fw)) {//o true é para manter os dados do arquivo intaquitos, ou seja, ao execurar novamente o programa, o arquivo nao seja atualizado os dados.
            br.write("Escrevendo no arquivo");
            br.newLine();
            br.write("Escrevendo uma segunda linha");
            br.newLine();
            br.flush();//cospe tudo que tem no buffer.
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
