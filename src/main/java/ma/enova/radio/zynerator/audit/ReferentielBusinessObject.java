package ma.enova.radio.zynerator.audit;

import ma.enova.radio.zynerator.bean.BusinessObject;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;

/**
 * Classe mère abstraite de tous les Objets métier.
 *
 * @author JAF
 * @version 1.2
 */

@MappedSuperclass
@EntityListeners(EntityListener.class)
public class ReferentielBusinessObject extends AuditBusinessObject {

    /**
     * created on
     */
    private Long etablissementId;

    public Long getEtablissementId() {
        return etablissementId;
    }

    public void setEtablissementId(Long etablissementId) {
        this.etablissementId = etablissementId;
    }
}
