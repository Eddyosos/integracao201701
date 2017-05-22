package com.github.Eddyosos.integracao20171.esus.cds.common;

import br.gov.saude.esus.cds.transport.generated.thrift.common.VariasLotacoesHeaderThrift;

public class VariasLotacoesHeader {
    private final VariasLotacoesHeaderThrift instance;

    public VariasLotacoesHeader(VariasLotacoesHeaderThrift headerTransport) {
        instance = headerTransport;
    }

    public VariasLotacoesHeaderThrift getInstance() {
        return instance;
    }
}

