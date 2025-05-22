package estudos.java.introducao;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class JavaBeans implements Serializable{


    /**
     * Classe JavaBean representando um Funcionário.
     * <p>
     * Segue as convenções JavaBeans:
     * <ul>
     *   <li>Implementa Serializable</li>
     *   <li>Construtor público sem argumentos</li>
     *   <li>Getters e setters para todas as propriedades</li>
     *   <li>Suporte a notificação de mudança de propriedades</li>
     * </ul>
     * </p>
     */

        private static final long serialVersionUID = 1L;

        private int id;
        private String nome;
        private String sobrenome;
        private String email;
        private LocalDate dataNascimento;
        private BigDecimal salario;

        // Suporte a listeners de mudança de propriedade
        private transient PropertyChangeSupport suporteMudanca = new PropertyChangeSupport(this);

        /**
         * Construtor público sem argumentos.
         */
        public JavaBeans() {
        }

        /**
         * Construtor completo.
         */
        public JavaBeans(int id, String nome, String sobrenome, String email,
                           LocalDate dataNascimento, BigDecimal salario) {
            this.id = id;
            this.nome = nome;
            this.sobrenome = sobrenome;
            this.email = email;
            this.dataNascimento = dataNascimento;
            this.salario = salario;
        }

        // Métodos para gerenciar PropertyChangeListener
        public void adicionarListener(PropertyChangeListener listener) {
            suporteMudanca.addPropertyChangeListener(listener);
        }

        public void removerListener(PropertyChangeListener listener) {
            suporteMudanca.removePropertyChangeListener(listener);
        }

        // Getters e setters com notificação de mudança
        public int getId() {
            return id;
        }

        public void setId(int id) {
            int antigo = this.id;
            this.id = id;
            suporteMudanca.firePropertyChange("id", antigo, id);
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            String antigo = this.nome;
            this.nome = nome;
            suporteMudanca.firePropertyChange("nome", antigo, nome);
        }

        public String getSobrenome() {
            return sobrenome;
        }

        public void setSobrenome(String sobrenome) {
            String antigo = this.sobrenome;
            this.sobrenome = sobrenome;
            suporteMudanca.firePropertyChange("sobrenome", antigo, sobrenome);
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            String antigo = this.email;
            this.email = email;
            suporteMudanca.firePropertyChange("email", antigo, email);
        }

        public LocalDate getDataNascimento() {
            return dataNascimento;
        }

        public void setDataNascimento(LocalDate dataNascimento) {
            LocalDate antiga = this.dataNascimento;
            this.dataNascimento = dataNascimento;
            suporteMudanca.firePropertyChange("dataNascimento", antiga, dataNascimento);
        }

        public BigDecimal getSalario() {
            return salario;
        }

        public void setSalario(BigDecimal salario) {
            BigDecimal antigo = this.salario;
            this.salario = salario;
            suporteMudanca.firePropertyChange("salario", antigo, salario);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof JavaBeans)) return false;
            JavaBeans f = (JavaBeans) o;
            return id == f.id && Objects.equals(email, f.email);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, email);
        }

        @Override
        public String toString() {
            return "Funcionario{" +
                    "id=" + id +
                    ", nome='" + nome + '\'' +
                    ", sobrenome='" + sobrenome + '\'' +
                    ", email='" + email + '\'' +
                    ", dataNascimento=" + dataNascimento +
                    ", salario=" + salario +
                    '}';
        }
    }


