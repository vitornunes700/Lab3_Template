# Laboratório 3

Este trabalho laboratorial cobre o padrão de software *Strategy*.
Pretende-se poder calcular diversas estatísticas sobre um conjunto de notas, 
utilizando este padrão.


1. Crie a interface `Statistic` com o método:

    `public double compute(Iterable<GradeEntry> grades)`

2. Crie três concretizações desta interface por forma a poder calcular três
estatísticas, nomeadamente **média aritmética**, **nota mínima** e **nota máxima**; 
    * No caso de o conjunto de notas ser vazio, deve ser devolvido o valor -1.

3. Adicione um atributo do tipo `Statistic` à classe **CourseGrades** e os métodos `void changeStatistic(Statistic s)` e 
`double computeStatistic()`; a estatística por "omissão" calcula a média.

4. Altere o método main por forma a poder mostrar o valor das três estatísticas para o
conjunto de alunos existentes na grelha.