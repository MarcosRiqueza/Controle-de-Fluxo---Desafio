package com.desafio.controlefluxo;

public class Contador {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Por favor, forneça dois parâmetros inteiros.");
            return;
        }

        try {
            int inicio = Integer.parseInt(args[0]);
            int fim = Integer.parseInt(args[1]);

            if (inicio > fim) {
                throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
            }

            for (int i = inicio; i <= fim; i++) {
                System.out.println("Imprimindo o número " + i);
            }
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Os parâmetros devem ser números inteiros.");
        }
    }
}package com.desafio.controlefluxo;

public class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String message) {
        super(message);
    }
}
{
    "version": "2.0.0",
    "tasks": [
      {
        "label": "compile",
        "type": "shell",
        "command": "javac",
        "args": [
          "-d",
          "bin",
          "src/com/desafio/controlefluxo/*.java"
        ],
        "group": {
          "kind": "build",
          "isDefault": true
        },
        "problemMatcher": []
      }{
        "version": "0.2.0",
        "configurations": [
          {
            "type": "java",
            "name": "Debug (Launch)",
            "request": "launch",
            "mainClass": "com.desafio.controlefluxo.Contador",
            "projectName": "DesafioControleFluxo"
          }
        ]
      }
      
    ]
  }
  
