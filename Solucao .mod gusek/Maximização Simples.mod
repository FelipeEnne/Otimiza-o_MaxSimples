#
# Maximiza��o Simples
#
# 



/* Vari�veis de decis�o */
var V_Grande >=0;  /* Vaso Grande  */
var V_Pequeno >=0;  /* Vaso Pequeno  */


/* Restri��es */
s.t. Demanda1:  V_Grande <= 4;
s.t. Demanda2:  V_Pequeno <= 6;
s.t. Tempo   : 1.5*V_Grande + 0.83333*V_Pequeno <= 8;


/* Fun��o Objetivo */
maximize Lucro: 8*V_Grande + 5*V_Pequeno;





end;