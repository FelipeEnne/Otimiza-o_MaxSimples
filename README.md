# Um Problema Simples de Otimização

### Resolvido por:
#### * Excel
#### * .mod gusek
#### * Java Cplex


## **Problema**

Um Artesão faz vasos artesanais para vender numa loja que acontece todo dia. 
Ele faz vasos grandes e vasos pequenos, e os vende por R$8,00 e R$5,00, respectivamente. 
Ele só consegue vender 4 quadros grandes e 6 quadros pequenos por dia. 
O vasos grande é feito em 1 hora 30 minutos e o pequeno é feito em 50 minutos . 
O Artesão trabalha 8 horas por dia. Quantos vasos de cada tipo ele deve fazer para maximizar a sua receita?


## Formulação Matemática

Maximizar :
8* Vaso Grande + 5 * Vaso Pequeno

Restrições :

Demanda :
Vaso Grande = 4
Vaso Pequeno = 6
Tempo
1,5*Vaso Grande + 0,83333*Vaso Pequeno = 8
