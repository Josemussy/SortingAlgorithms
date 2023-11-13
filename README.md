# SortingAlgorithms

Projeto desenvolvido na disciplina de Resolução de Problemas Estruturados em Computação, durante o curso de Eng. de Software na PUCPR.
Vídeo de explicação: https://youtu.be/Z12yxm_C0rA

O projeto visa o estudo da implementação das estruturas de ordenação Bubble Sort, Insertion Sort e Quick Sort. Para facilitar o estudo foi implementada uma interface no console para escolher qual é o tipo de ordenação a ser feita, onde é criado o array pré-estabelecido.
![image](https://github.com/Josemussy/SortingAlgorithms/assets/101639053/39956baf-6e95-4d27-adae-238ffb8e3177)
![image](https://github.com/Josemussy/SortingAlgorithms/assets/101639053/aaa4ff3e-9488-4ee7-b1fc-a06aa78a7e19)


Por questões de manter o código mais organizado, foi criada a superclasse SortingAlgorithms que apresenta dois métodos que são utilizados por todas as subclasses que são os algoritmos de orndenação. O método swap(int[] array, int i, int j) faz a troca de posição dos elementos no array e o printArray(int[] array) que realiza a impressão do array.
![image](https://github.com/Josemussy/SortingAlgorithms/assets/101639053/a931baad-3a06-41b8-be95-63612d10047a)


Na subclasse BubbleSort tem-se apenas o algoritmo de ordenação que percorre comparando elemento a elemento até colocar o elemento de maior valor na última posição do array, após isso é chamado o método novamento, por recursividade, até que seja ordenado todo o array.
![image](https://github.com/Josemussy/SortingAlgorithms/assets/101639053/f669b0de-6cbf-4301-92bb-911807875332)

Na subclasse InsertionSort, o algoritmo realiza a comparação com os elementos anteriores a ele e o elemento é inserido em sua posição correta.
![image](https://github.com/Josemussy/SortingAlgorithms/assets/101639053/b282e030-bdf6-41b1-8a2b-ce2c30d6e7f6)

Na subclasse QuickSort, foi definido que o pivot é o último elemento do array. Com isso, é feito a comparação com todos os elementos anteriores, partindo do indíce 0, separando-os de forma que os elementos menores que o pivot, ficam a esquerda e os maiores a direita. Após realizar essa divisão de subarray menor e maior, o pivot troca de posição com o primeiro elemento do array maior, assumindo sua posição correta.
Na sequência é executado por recursividade o quick sort nos subarrays criados, até que se tenha o array totalmente ordenado.
![image](https://github.com/Josemussy/SortingAlgorithms/assets/101639053/3ae16d2d-b3d6-45c9-ae75-d2cbac694682)
