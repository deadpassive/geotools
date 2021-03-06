/**
 */
package net.opengis.wcs20;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.opengis.wcs20.Wcs20Package
 * @generated
 */
public interface Wcs20Factory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    Wcs20Factory eINSTANCE = net.opengis.wcs20.impl.Wcs20FactoryImpl.init();

    /**
     * Returns a new object of class '<em>Capabilities Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Capabilities Type</em>'.
     * @generated
     */
    CapabilitiesType createCapabilitiesType();

    /**
     * Returns a new object of class '<em>Contents Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Contents Type</em>'.
     * @generated
     */
    ContentsType createContentsType();

    /**
     * Returns a new object of class '<em>Coverage Descriptions Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Coverage Descriptions Type</em>'.
     * @generated
     */
    CoverageDescriptionsType createCoverageDescriptionsType();

    /**
     * Returns a new object of class '<em>Coverage Description Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Coverage Description Type</em>'.
     * @generated
     */
    CoverageDescriptionType createCoverageDescriptionType();

    /**
     * Returns a new object of class '<em>Coverage Offerings Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Coverage Offerings Type</em>'.
     * @generated
     */
    CoverageOfferingsType createCoverageOfferingsType();

    /**
     * Returns a new object of class '<em>Coverage Subtype Parent Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Coverage Subtype Parent Type</em>'.
     * @generated
     */
    CoverageSubtypeParentType createCoverageSubtypeParentType();

    /**
     * Returns a new object of class '<em>Coverage Summary Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Coverage Summary Type</em>'.
     * @generated
     */
    CoverageSummaryType createCoverageSummaryType();

    /**
     * Returns a new object of class '<em>Describe Coverage Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Describe Coverage Type</em>'.
     * @generated
     */
    DescribeCoverageType createDescribeCoverageType();

    /**
     * Returns a new object of class '<em>Dimension Slice Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Dimension Slice Type</em>'.
     * @generated
     */
    DimensionSliceType createDimensionSliceType();

    /**
     * Returns a new object of class '<em>Dimension Trim Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Dimension Trim Type</em>'.
     * @generated
     */
    DimensionTrimType createDimensionTrimType();

    /**
     * Returns a new object of class '<em>Document Root</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Document Root</em>'.
     * @generated
     */
    DocumentRoot createDocumentRoot();

    /**
     * Returns a new object of class '<em>Extension Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Extension Type</em>'.
     * @generated
     */
    ExtensionType createExtensionType();

    /**
     * Returns a new object of class '<em>Get Capabilities Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Get Capabilities Type</em>'.
     * @generated
     */
    GetCapabilitiesType createGetCapabilitiesType();

    /**
     * Returns a new object of class '<em>Get Coverage Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Get Coverage Type</em>'.
     * @generated
     */
    GetCoverageType createGetCoverageType();

    /**
     * Returns a new object of class '<em>Offered Coverage Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Offered Coverage Type</em>'.
     * @generated
     */
    OfferedCoverageType createOfferedCoverageType();

    /**
     * Returns a new object of class '<em>Service Metadata Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Service Metadata Type</em>'.
     * @generated
     */
    ServiceMetadataType createServiceMetadataType();

    /**
     * Returns a new object of class '<em>Service Parameters Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Service Parameters Type</em>'.
     * @generated
     */
    ServiceParametersType createServiceParametersType();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    Wcs20Package getWcs20Package();

} //Wcs20Factory
