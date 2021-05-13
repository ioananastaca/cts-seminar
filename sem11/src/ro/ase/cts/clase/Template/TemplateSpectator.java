package ro.ase.cts.clase.Template;

public abstract class TemplateSpectator {

	public abstract void seAseazaLaCoada();
	public abstract void prezintaBiletul();
	public abstract void seFaceControlulCorporal();
	public abstract void ocupaLocul();
	
	public final void intrareStadion() {
		seAseazaLaCoada();
		prezintaBiletul();
		seFaceControlulCorporal();
		ocupaLocul();
		
	}
}
