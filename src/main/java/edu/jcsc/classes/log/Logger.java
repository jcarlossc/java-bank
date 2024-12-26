package edu.jcsc.classes.log;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Classe Logger
 * 
 * @author Carlos da Costa
 * @version 1.0
 */
public class Logger {

    private static Logger instancia;
    private PrintWriter criarLog;
    private static final String LOG_FILE = "logs.txt"; // Caminho do arquivo de log
    private static final DateTimeFormatter formatar = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    /**
     * Construtor privado. 
     * 
     */
    private Logger() {
        try {
            criarLog = new PrintWriter(new FileWriter(LOG_FILE, true)); // Modo de anexação
        } catch (IOException e) {
            System.err.println("Erro ao inicializar o logger: " + e.getMessage());
        }
    }

    /**
     * Método para obter a única instância do logger.
     * 
     * @return instancia.
     */
    public static synchronized Logger getInstance() {
        if (instancia == null) {
            instancia = new Logger();
        }
        return instancia;
    }

    /**
     * Método para gravar mensagens no arquivo de log.
     * 
     * @param nivel
     * @param mensagem
     */
    public void log(String nivel, String mensagem) {
        if (criarLog != null) {
            String dataHora = LocalDateTime.now().format(formatar);
            criarLog.println("[" + dataHora + "] [" + nivel + "] " + mensagem);
            criarLog.flush();
        }
    }

    /**
     * Método para fechar o Logger.
     * 
     */
    public void close() {
        if (criarLog != null) {
            criarLog.close();
        }
    }
}

