package br.unesp.locadora.util;

/**
 * Utilitário para validação de dados.
 */
public class Validar {

    /**
     * Valida CPF.
     *
     * @param cpf CPF.
     * @return
     */
    public static boolean cpf(String cpf) {

        boolean valido = (cpf.trim().length() == 11);

        try {

            int total = 0, digito1, digito2;
            String base = (valido ? cpf.trim().substring(0, 9) : ""), aux;

            for (int i = 0, peso = 10; valido && i < 10; i++, peso--) {

                aux = String.format("%011d", 0).replace("0", String.valueOf(i));
                valido = !aux.equals(cpf);

                if (i < 9) {
                    total += Character.getNumericValue(cpf.charAt(i)) * peso;
                }
            }

            digito1 = total % 11;
            digito1 = (digito1 < 2 ? 0 : 11 - digito1);
            base += digito1;
            total = 0;

            for (int i = 0, peso = 11; valido && i < 10; i++, peso--) {
                total += Character.getNumericValue(base.charAt(i)) * peso;
            }

            digito2 = total % 11;
            digito2 = (digito2 < 2 ? 0 : 11 - digito2);
            base += digito2;

            if (valido) {
                valido = base.equals(cpf);
            }
        } catch (Exception ex) {
            valido = false;
        }

        return valido;
    }

    /**
     * Valida CNPJ.
     *
     * @param cnpj CNPJ.
     * @return
     */
    public static boolean cnpj(String cnpj) {

        boolean valido = (cnpj.trim().length() == 14);

        try {

            int total = 0, digito1, digito2;
            String base = (valido ? cnpj.trim().substring(0, 12) : ""), aux;

            for (int i = 0, peso = 5; valido && i < 12; i++, peso--) {

                if (peso == 1) {
                    peso = 9;
                }

                if (i < 10) {
                    aux = String.format("%014d", 0).replace("0", String.valueOf(i));
                    valido = !aux.equals(cnpj);
                }

                total += Character.getNumericValue(cnpj.charAt(i)) * peso;
            }

            digito1 = total % 11;
            digito1 = (digito1 < 2 ? 0 : 11 - digito1);
            base += digito1;
            total = 0;

            for (int i = 0, peso = 6; valido && i < 13; i++, peso--) {

                if (peso == 1) {
                    peso = 9;
                }

                total += Character.getNumericValue(base.charAt(i)) * peso;
            }

            digito2 = total % 11;
            digito2 = (digito2 < 2 ? 0 : 11 - digito2);
            base += digito2;

            if (valido) {
                valido = base.equals(cnpj);
            }
        } catch (Exception ex) {
            valido = false;
        }

        return valido;
    }

    /**
     * Valida telefone.
     *
     * @param telefone Telefone.
     * @return
     */
    public static boolean telefone(String telefone) {
        return telefone.matches("^[0-9]{2}[0-9]{8,9}$");
    }

    /**
     * Valida e-mail.
     *
     * @param email E-mail.
     * @return
     */
    public static boolean email(String email) {
        return email.matches("^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w-_]+\\.)+[\\w]+[\\w]$");
    }

    /**
     * Valida CEP.
     *
     * @param cep CEP.
     * @return
     */
    public static boolean cep(String cep) {
        return cep.matches("^[0-9]{8}$");
    }

    /**
     * Valida placa.
     *
     * @param placa Placa.
     * @return
     */
    public static boolean placa(String placa) {
        return placa.toUpperCase().matches("^[A-Z]{3}[0-9]{4}$");
    }

    /**
     * Valida RENAVAM.
     *
     * @param renavam RENAVAM.
     * @return
     */
    public static boolean renavam(String renavam) {
        return renavam.matches("^[0-9]{11}$");
    }

}
